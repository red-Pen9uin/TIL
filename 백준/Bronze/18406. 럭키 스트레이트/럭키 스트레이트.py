lucky_test = input()
lucky_len = len(lucky_test)//2

part_1 = lucky_test[:lucky_len]
part_2 = lucky_test[lucky_len:]

part_1 = list(map(int, list(part_1)))
part_2 = list(map(int, list(part_2)))
if sum(part_1) != sum(part_2):
    print("READY")
else:
    print("LUCKY")