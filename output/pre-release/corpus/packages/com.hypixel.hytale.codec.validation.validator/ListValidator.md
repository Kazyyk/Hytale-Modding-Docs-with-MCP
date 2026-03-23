# ListValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator | Implements: LegacyValidator

public class ListValidator<T> implements LegacyValidator<List<T>>

## Fields

- private Validator<T> validator

## Methods

- public ListValidator(Validator<T> validator)
- public void accept(@Nonnull List<T> ts, ValidationResults results)

Also in this package: ArraySizeRangeValidator, ArraySizeValidator, ArrayValidator, DeprecatedValidator, DoubleArraySizeValidator, DoubleArrayValidator, EqualValidator, FloatArrayValidator, IntArraySizeValidator, IntArrayValidator, MapKeyValidator, MapValidator, MapValueValidator, NonEmptyArrayValidator, NonEmptyDoubleArrayValidator, NonEmptyFloatArrayValidator, NonEmptyMapValidator, NonEmptyStringValidator, NonNullValidator, NotEqualValidator (and 6 more)

Complete API:
  public void accept(List<T> ts, ValidationResults results)

Fields:
private Validator<T> validator
