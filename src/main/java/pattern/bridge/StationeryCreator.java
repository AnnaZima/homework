package pattern.bridge;

public class StationeryCreator {
    public static void main(String[] args) {
        Stationery[] stationeries = {new Markers(new Black()),
                new Pencil(new Red()),
                new Markers(new Green())
        };

        for(Stationery stationery: stationeries) {
            stationery.write();
        }
    }
}
