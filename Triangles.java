public class Triangles {
    
    public static void main(String[] args){

        //runs an executable method to print out two triangles
        trianglePrinter();
    }

    
    public static void trianglePrinter(){

        //runs the code that prints out a triangle facing to the right
        System.out.println("#");
        System.out.println("##");
        System.out.println("###");
        System.out.println("####");
        System.out.println("#####");

        //add a space between both triangles
        System.out.println("");

        //add a second triangle to the screen, this time facing to the left.
        System.out.println("    #");
        System.out.println("   ##");
        System.out.println("  ###");
        System.out.println(" ####");
        System.out.println("#####");
    }
}
