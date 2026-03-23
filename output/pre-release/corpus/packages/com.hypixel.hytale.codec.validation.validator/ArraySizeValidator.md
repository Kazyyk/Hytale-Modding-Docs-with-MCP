# ArraySizeValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator

public class ArraySizeValidator<T> implements Validator<T[]>

## Fields

- private final int size

## Methods

- public ArraySizeValidator(int size)
- public void accept(@Nonnull T[] array, @Nonnull ValidationResults results)
- public void updateSchema(SchemaContext context, Schema target)

Also in this package: ArraySizeRangeValidator, ArrayValidator, DeprecatedValidator, DoubleArraySizeValidator, DoubleArrayValidator, EqualValidator, FloatArrayValidator, IntArraySizeValidator, IntArrayValidator, ListValidator, MapKeyValidator, MapValidator, MapValueValidator, NonEmptyArrayValidator, NonEmptyDoubleArrayValidator, NonEmptyFloatArrayValidator, NonEmptyMapValidator, NonEmptyStringValidator, NonNullValidator, NotEqualValidator (and 6 more)

Complete API:
  public void accept(T[] array, ValidationResults results)
  public void updateSchema(SchemaContext context, Schema target)

Fields:
private final int size
