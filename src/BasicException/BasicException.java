package BasicException;

public class BasicException {
    public static void main(String[] args) {
        try{

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void validate(String id) throws Exception{
        try {
            if (id == null || id.equals("")) {
                Exception e = new Exception("ID를 입력하세요.");
                throw e;
            }
            if (id.length()<8){
                throw new Exception("8장 이상 입력하세요.");
            }
        }catch( Exception e ){
            throw e;
        }
    }
}
