Map<String,String> dictionary = new HashMap<String,String>();
dictionary.put('Коля', '1000');
dictionary.put('Вася', '500');
dictionary.put('Петя','200');
str = dictionary.values()*.toInteger();
System.out.println(str.sum());