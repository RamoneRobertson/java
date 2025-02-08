class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder result = new StringBuilder();
        boolean capitalize = false;

        for(char c : identifier.toCharArray()){
            if(c == '-') {
                capitalize = true;
            }else {
                if(capitalize) {
                    result.append(Character.toUpperCase(c));
                    capitalize = false;
                } else {
                    result.append(c);
                }
            }
        }

        return result.toString()
                .replaceAll(" ", "_")
                .replaceAll("4", "a")
                .replaceAll("3", "e")
                .replaceAll("0", "o")
                .replaceAll("1", "l")
                .replaceAll("7", "t");
    }
}
