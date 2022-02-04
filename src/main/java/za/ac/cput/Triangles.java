/*
 * 4 January
 * ADP3 - Test Driven Development
 * Tyler Yorke Fredericks - 218047894
 */

package za.ac.cput;

public class Triangles {

    public String RightTriangle, AcuteTriangle, Triangle;

    public String getRightTriangle() {
        return RightTriangle;
    }

    public void setRightTriangle(String rightTriangle) {
        RightTriangle = rightTriangle;
    }

    public String getAcuteTriangle() {
        return AcuteTriangle;
    }

    public void setAcuteTriangle(String acuteTriangle) {
        AcuteTriangle = acuteTriangle;
    }

    public String getTriangle() {
        return Triangle;
    }

    public void setTriangle(String triangle) {
        Triangle = triangle;
    }

    @Override
    public String toString() {
        return "Triangles{" +
                "RightTriangle='" + RightTriangle + '\'' +
                ", AcuteTriangle='" + AcuteTriangle + '\'' +
                ", Triangle='" + Triangle + '\'' +
                '}';
    }

}
