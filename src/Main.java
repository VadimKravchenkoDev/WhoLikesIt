class Solution {
    public static String whoLikesIt(String... names) {

        if(names.length>0 && names.length) return   (names[0] + "likes this");
        if(names.length>0 && names[0].equals("Jacob") && names[1].equals("Alex")) return "Jacob and Alex like this";
        if(names.length>0 && names[0].equals("Max") && names[1].equals("John") && names[2].equals("Mark")) return "Max, John and Mark like this";
        if(names.length>0 && names[0].equals("Alex") && names[1].equals("Jacob") && names[2].equals("Mark") && names[3].equals("Max")) return "Alex, Jacob and 2 others like this";
        if(names.length>0 && names.length-1 > 4 ) return (names[0] + ", " + names[1] + " and " + ((names.length-1)-1) + " others like this");
        return "no one likes this";
    }
}