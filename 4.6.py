class MutableString(str):
    def __init__(self, text):
        self.mut_string = text

    def __str__(self):
        return self.mut_string

    def __getitem__(self, item):
        return MutableString(self.mut_string[item.start:item.stop:item.step])

    def __setitem__(self, key, value):
        if isinstance(key, slice):
            self.mut_string = list(self.mut_string)
            self.mut_string[key.start:key.stop:key.step] = value
            self.mut_string = MutableString(''.join(self.mut_string))
        else:
            self.mut_string = self.mut_string[:key] + value + self.mut_string[key + 1:]

string = MutableString('MutableStr')
print(string)
string = string[::1]
print(string[:7])
print(string, "id =", id(string))
string[0:6:1] = 'Wopwop'
print(string, "id =", id(string))
string[0] = 'B'
print(string, "id =", id(string))