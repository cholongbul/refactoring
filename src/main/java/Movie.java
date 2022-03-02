/**
 * packageName : PACKAGE_NAME
 * fileName : Movie
 * author : ohjm
 * date : 2022/03/02 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2022/03/02 ohjm 최초 생성
 */
public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode){
        _title = title;
        _priceCode = priceCode;
    }

    public String getTitle() {
        return _title;
    }

    public int getpriceCode() {
        return _priceCode;
    }

    public void setpriceCode(int _priceCode) {
        this._priceCode = _priceCode;
    }
}
