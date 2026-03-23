# DoubleArrayValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator

public class DoubleArrayValidator implements Validator<double[]>

## Fields

- private Validator<Double> validator

## Methods

- public DoubleArrayValidator(Validator<Double> validator)
- public void accept(@Nonnull double[] ds, ValidationResults results)
- public void updateSchema(SchemaContext context, Schema target)

Known subclasses: DoubleSequenceValidator

Also in this package: ArraySizeRangeValidator, ArraySizeValidator, ArrayValidator, DeprecatedValidator, DoubleArraySizeValidator, EqualValidator, FloatArrayValidator, IntArraySizeValidator, IntArrayValidator, ListValidator, MapKeyValidator, MapValidator, MapValueValidator, NonEmptyArrayValidator, NonEmptyDoubleArrayValidator, NonEmptyFloatArrayValidator, NonEmptyMapValidator, NonEmptyStringValidator, NonNullValidator, NotEqualValidator (and 6 more)

Complete API:
  public void accept(double[] ds, ValidationResults results)
  public void updateSchema(SchemaContext context, Schema target)

Fields:
private Validator<Double> validator
