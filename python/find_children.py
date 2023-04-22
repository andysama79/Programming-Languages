def find_children(dancing_brigade):
    #your code here
    homies = []
    for family in dancing_brigade:
        homies.append(family)
    
    homies.sort()
    dancing_brigade = ''.join(homies)
    
    break_point = 0
    for b in range(0, len(dancing_brigade)):
        if dancing_brigade[b] > 'Z':
            break_point = b
            break
    
    mommy = dancing_brigade[0:b]
    children = dancing_brigade[b:len(dancing_brigade)]

    print(mommy)
    print(children)
    
    reunion = ''
    for mum in mommy:
        reunion += mum
        for child in children:
            if mum.lower() == child:
                reunion += child
     
    return reunion

print(find_children("C"))