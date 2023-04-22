//  SPDX-License-Identifier: GPL-3.0

pragma solidity >0.7.0 <0.9.0;

//  TODO: create a smart contract for a simple online marketplace
//  *This contract lets users list an item for sale
//  *and buy an available item. Two roles: seller, and buyer

contract Marketplace {
    //  todo: three state variables: seller, buyer, balances
    address public seller;
    address public buyer;
    mapping (address => uint) public balances;

    //  todo: two events: ListItem, PurchasedItem
    event ListItem(address seller, uint price);
    event PurchasedItem(address seller, address buyer, uint price);

    //  todo: one enum, two values; ItemAvailable, ItemPurchased
    enum StateType {
        ItemAvailable,
        ItemPurchased
    }

    StateType public State;

    constructor() {
        seller =  msg.sender;
        State = StateType.ItemAvailable;
    }

    //  !   Note: avoid using same names for both parameter and state variables
    //  !   Node: add an underscore in front or give a separate name altogether

    function setBalance(address _participant, uint amount) public {
        require(msg.sender == _participant, "Can't set others!");
        balances[_participant] += amount;
    }

    function buy(address _seller, address _buyer, uint price) public payable {
        require(price <= balances[_buyer], "Insufficient balance!");
        State = StateType.ItemPurchased;
        balances[_buyer] -= price;
        balances[_seller] += price;

        emit PurchasedItem(_seller, _buyer, msg.value);
    }
}

