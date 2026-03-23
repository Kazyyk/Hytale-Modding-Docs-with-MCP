# ArraySizeRangeValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator

public class ArraySizeRangeValidator<T> implements Validator<T[]>

## Fields

- private int min
- private int max

## Methods

- public ArraySizeRangeValidator(int min, int max)
- public void accept(@Nonnull T[] array, @Nonnull ValidationResults results)
- public void updateSchema(SchemaContext context, Schema target)

Also in this package: ArraySizeValidator, ArrayValidator, DeprecatedValidator, DoubleArraySizeValidator, DoubleArrayValidator, EqualValidator, FloatArrayValidator, IntArraySizeValidator, IntArrayValidator, ListValidator, MapKeyValidator, MapValidator, MapValueValidator, NonEmptyArrayValidator, NonEmptyDoubleArrayValidator, NonEmptyFloatArrayValidator, NonEmptyMapValidator, NonEmptyStringValidator, NonNullValidator, NotEqualValidator (and 6 more)

Complete API:
  public void accept(T[] array, ValidationResults results)
  public void updateSchema(SchemaContext context, Schema target)

Fields:
private int min
private int max
