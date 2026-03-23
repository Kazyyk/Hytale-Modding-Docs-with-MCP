# NonEmptyDoubleArrayValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator

public class NonEmptyDoubleArrayValidator implements Validator<double[]>

## Constants

- public static final NonEmptyDoubleArrayValidator INSTANCE

## Methods

- private NonEmptyDoubleArrayValidator()
- public void accept(@Nullable double[] doubles, @Nonnull ValidationResults results)
- public void updateSchema(SchemaContext context, Schema target)

Also in this package: ArraySizeRangeValidator, ArraySizeValidator, ArrayValidator, DeprecatedValidator, DoubleArraySizeValidator, DoubleArrayValidator, EqualValidator, FloatArrayValidator, IntArraySizeValidator, IntArrayValidator, ListValidator, MapKeyValidator, MapValidator, MapValueValidator, NonEmptyArrayValidator, NonEmptyFloatArrayValidator, NonEmptyMapValidator, NonEmptyStringValidator, NonNullValidator, NotEqualValidator (and 6 more)

Complete API:
  public void accept(double[] doubles, ValidationResults results)
  public void updateSchema(SchemaContext context, Schema target)

Fields:
public static final NonEmptyDoubleArrayValidator INSTANCE
