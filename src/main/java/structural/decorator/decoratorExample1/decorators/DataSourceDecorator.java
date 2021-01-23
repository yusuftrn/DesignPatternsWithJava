package structural.decorator.decoratorExample1.decorators;

public class DataSourceDecorator implements DataSource {

    private DataSource dataWrapper;

    DataSourceDecorator(DataSource source) {
        this.dataWrapper = source;
    }

    @Override
    public void writeData(String data) {
        dataWrapper.writeData(data);
    }

    @Override
    public String readData() {
        return dataWrapper.readData();
    }
}
