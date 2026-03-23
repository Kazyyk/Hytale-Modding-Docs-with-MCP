# IntArraySizeValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator

public class IntArraySizeValidator implements Validator<int[]>

## Fields

- private int size

## Methods

- public IntArraySizeValidator(int size)
- public void accept(@Nonnull int[] array, @Nonnull ValidationResults results)
- public void updateSchema(SchemaContext context, Schema target)

Also in this package: ArraySizeRangeValidator, ArraySizeValidator, ArrayValidator, DeprecatedValidator, DoubleArraySizeValidator, DoubleArrayValidator, EqualValidator, FloatArrayValidator, IntArrayValidator, ListValidator, MapKeyValidator, MapValidator, MapValueValidator, NonEmptyArrayValidator, NonEmptyDoubleArrayValidator, NonEmptyFloatArrayValidator, NonEmptyMapValidator, NonEmptyStringValidator, NonNullValidator, NotEqualValidator (and 6 more)

Complete API:
  public void accept(int[] array, ValidationResults results)
  public void updateSchema(SchemaContext context, Schema target)

Fields:
private int size
