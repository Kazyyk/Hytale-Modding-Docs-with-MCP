# FloatArrayValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator

public class FloatArrayValidator implements Validator<float[]>

## Fields

- private final Validator<Float> validator

## Methods

- public FloatArrayValidator(Validator<Float> validator)
- public void accept(@Nullable float[] floats, ValidationResults results)
- public void updateSchema(SchemaContext context, Schema target)

Also in this package: ArraySizeRangeValidator, ArraySizeValidator, ArrayValidator, DeprecatedValidator, DoubleArraySizeValidator, DoubleArrayValidator, EqualValidator, IntArraySizeValidator, IntArrayValidator, ListValidator, MapKeyValidator, MapValidator, MapValueValidator, NonEmptyArrayValidator, NonEmptyDoubleArrayValidator, NonEmptyFloatArrayValidator, NonEmptyMapValidator, NonEmptyStringValidator, NonNullValidator, NotEqualValidator (and 6 more)

Complete API:
  public void accept(float[] floats, ValidationResults results)
  public void updateSchema(SchemaContext context, Schema target)

Fields:
private final Validator<Float> validator
