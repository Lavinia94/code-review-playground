def CalculateTotal(items, discount=[]):
    total = 0
    for i in range(len(items)):
        total = total + items[i]["price"]
    try:
        return total * 0.85
    except:
        pass
