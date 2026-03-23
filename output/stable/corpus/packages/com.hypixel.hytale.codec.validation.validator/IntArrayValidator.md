# IntArrayValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator

public class IntArrayValidator implements Validator<int[]>

## Fields

- private Validator<Integer> validator

## Methods

- public IntArrayValidator(Validator<Integer> validator)
- public void accept(@Nonnull int[] is, ValidationResults results)
- public void updateSchema(SchemaContext context, Schema target)

Known subclasses: IntSequenceValidator

Also in this package: ArraySizeRangeValidator, ArraySizeValidator, ArrayValidator, DeprecatedValidator, DoubleArraySizeValidator, DoubleArrayValidator, EqualValidator, FloatArrayValidator, IntArraySizeValidator, ListValidator, MapKeyValidator, MapValidator, MapValueValidator, NonEmptyArrayValidator, NonEmptyDoubleArrayValidator, NonEmptyFloatArrayValidator, NonEmptyMapValidator, NonEmptyStringValidator, NonNullValidator, NotEqualValidator (and 6 more)

Complete API:
  public void accept(int[] is, ValidationResults results)
  public void updateSchema(SchemaContext context, Schema target)

Fields:
private Validator<Integer> validator
