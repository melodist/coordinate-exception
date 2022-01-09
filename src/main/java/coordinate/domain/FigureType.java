package coordinate.domain;

import coordinate.domain.exception.NotFoundFigureTypeException;

public enum FigureType {
    LINE("선", 2),
    TRIANGLE("삼각형", 3),
    RECTANGLE("사각형", 4);

    private final String name;
    private final int size;

    FigureType(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public static FigureType getType(int size) throws NotFoundFigureTypeException {
        for (FigureType type : values()) {
            if (type.matchSize(size)) {
                return type;
            }
        }
        throw new NotFoundFigureTypeException("유효하지 않은 타입입니다.");
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    boolean matchSize(int size) {
        return this.size == size;
    }
}
