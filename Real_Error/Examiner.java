import exception.ColorTransparencyException;
import exception.PressureToleranceException;
import exception.SizeException;

import java.util.ArrayList;
import java.util.List;

public class Examiner {
    public List<String> checkProductList(List<Product> products) {
        List<String> list = new ArrayList<>();
          for (Product product : products) {
              try {
                  checkProduct(product);
              }catch (SizeException sizeException){
                  list.add(product.id+"-"+sizeException.getMessage());
              }catch (PressureToleranceException pressureToleranceException){
                  list.add(product.id+"-"+pressureToleranceException.getMessage());
              }catch (ColorTransparencyException colorTransparencyException){
                  list.add(product.id+"-"+colorTransparencyException.getMessage());
              }

          }

        return list;
    }

    private void checkProduct(Product p) throws SizeException, PressureToleranceException, ColorTransparencyException {
        if (p.size != 70)
            throw new SizeException();
        if (p.pressureTolerance < 1000)
            throw new PressureToleranceException();
        if (p.colorTransparency < 235 || p.colorTransparency > 245)
            throw new ColorTransparencyException();
    }
}
