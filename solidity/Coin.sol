// SPDX-License-Identifier: GPL-3.0
pragma solidity ^0.8.4;

contract Coin {
    // The keyword "public" makes variables
    // accessible form other contracts

    address public minter;  //* <type> <access> <var>
    //*(address type is a 160-bit value that does not allow any arithmetic ops)
    //* suitable for storing addresses of contracts, or a hash of the public half of a keypair belonging to external acoounts
    //* 'public' automatically generates a function that allows you to access current value of the state variable from outside the contract
    //* this is similar to:
    //* function minter() external view returns (address) { return minter; }

    //* 'mapping' addresses to unsigned integers
    //* they can be seen as hash tables which are virtually initialized
    //* it is not possible to obtain a list of all keys of a mapping, nor a list of all values
    //* record what you added to the mapping, or use it in a context where this is not needed
    //* the getter function here is more complex:
    //* fucntion balances(address account) external view returns (uint) { return balances[account]; }
    mapping(address => uint) public balances;

    // Events allow clients to react to specific
    // contract changes you declare
    //* ethereum clients such as web applications can listen for these events
    //* emitted on the blockchain without much cost
    //* as soon as it is emitted, the listener receives the arguments: 'from', 'to', and 'amount'
    //* which makes it possible to track transactions
    event Sent(address from, address to, uint amount);

    // Contructor code is only run when the contract
    // is created
    //* the 'msg' variable (together with 'tx' and 'global') is a
    //* special global variable that contains properties which allow
    //* access to the blockchain
    //* 'msg.sender' is always the address where the current (external) function call came from
    constructor() {
        minter = msg.sender;
    }

    // Sends an amount of newly created coins to an address
    // Can only be called by the contract creator

    function mint(address receiver, uint amount) public {
        require(msg.sender == minter);
        balances[receiver] += amount;
    }

    // Errors allow you to provide information about
    // why an operation failed. They are returned 
    // to the caller of the function
    //* used with the 'revert' statement
    //* unconditionally aborts and reverts all changes similart to the 'require' function
    error InsufficientBalance(uint requested, uint available);

    // Sends an amount of existing coins
    // from any caller to an address

    function send(address receiver, uint amount) public {
        if (amount > balances[msg.sender])
            revert InsufficientBalance({
                requested: amount,
                available: balances[msg.sender]
            });

        balances[msg.sender] -= amount;
        balances[receiver] += amount;
        emit Sent(msg.sender, receiver, amount);
    }
}
//! Note:
/* If you use this contract to send coins to an 
address, you will not see anything when you look
at that address on a blockchain explorer, because
the record that you sent coind and the changed
balances are only stored in the data storage
of this particular coin contract. By using events,
you can create a "blockchain explorer" that tracks
transactions and balances of your new coin, but you
have to inspect the coin contract address and not
the addresses of the coin owners. */