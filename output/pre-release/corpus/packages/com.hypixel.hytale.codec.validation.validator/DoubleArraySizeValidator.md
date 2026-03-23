# DoubleArraySizeValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator

public class DoubleArraySizeValidator implements Validator<double[]>

## Fields

- private final int size

## Methods

- public DoubleArraySizeValidator(int size)
- public void accept(@Nonnull double[] array, @Nonnull ValidationResults results)
- public void updateSchema(SchemaContext context, Schema target)

Also in this package: ArraySizeRangeValidator, ArraySizeValidator, ArrayValidator, DeprecatedValidator, DoubleArrayValidator, EqualValidator, FloatArrayValidator, IntArraySizeValidator, IntArrayValidator, ListValidator, MapKeyValidator, MapValidator, MapValueValidator, NonEmptyArrayValidator, NonEmptyDoubleArrayValidator, NonEmptyFloatArrayValidator, NonEmptyMapValidator, NonEmptyStringValidator, NonNullValidator, NotEqualValidator (and 6 more)

Complete API:
  public void accept(double[] array, ValidationResults results)
  public void updateSchema(SchemaContext context, Schema target)

Fields:
private final int size
