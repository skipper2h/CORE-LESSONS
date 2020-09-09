split = System.console().readLine('Enter cities with a space ').split()
map = [:]
for (text in split) {
    if (map.containsKey(text))
        map.put(text, map.get(text) + 1);
    else
        map.put(text, 1);
}
System.out.println(map);