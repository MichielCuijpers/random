

def binary_search(arr, el):
    if(arr == []):
        return None

    n = len(arr)

    if n == 1 :
        return 0 if arr[0] == el else None

    half = n / 2
    if(arr[half] == el):
        return half
    elif(arr[half] > el):
        print(arr[0:half])
        p1 = binary_search(arr[0:half], el)
        return p1
    else:
        p2 = binary_search(arr[half:], el)
        if(not p2):
            return None
        return half + p2

p = binary_search([1,2,3], 3)
print(p)
