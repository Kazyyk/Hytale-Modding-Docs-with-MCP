# SequentialDoubleArrayValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator

public class SequentialDoubleArrayValidator implements Validator<double[]>

## Constants

- public static final SequentialDoubleArrayValidator NEQ_INSTANCE
- public static final SequentialDoubleArrayValidator ALLOW_EQ_INSTANCE

## Fields

- private final boolean allowEquals

## Methods

- public SequentialDoubleArrayValidator(boolean allowEquals)
- public void accept(@Nonnull double[] doubles, @Nonnull ValidationResults results)
- public void updateSchema(SchemaContext context, Schema target)

Also in this package: ArraySizeRangeValidator, ArraySizeValidator, ArrayValidator, DeprecatedValidator, DoubleArraySizeValidator, DoubleArrayValidator, EqualValidator, FloatArrayValidator, IntArraySizeValidator, IntArrayValidator, ListValidator, MapKeyValidator, MapValidator, MapValueValidator, NonEmptyArrayValidator, NonEmptyDoubleArrayValidator, NonEmptyFloatArrayValidator, NonEmptyMapValidator, NonEmptyStringValidator, NonNullValidator (and 6 more)

Complete API:
  public void accept(double[] doubles, ValidationResults results)
  public void updateSchema(SchemaContext context, Schema target)

Fields:
public static final SequentialDoubleArrayValidator NEQ_INSTANCE
public static final SequentialDoubleArrayValidator ALLOW_EQ_INSTANCE
private final boolean allowEquals
