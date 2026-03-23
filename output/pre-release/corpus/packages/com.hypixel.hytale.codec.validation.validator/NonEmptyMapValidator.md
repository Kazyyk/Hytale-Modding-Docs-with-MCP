# NonEmptyMapValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator | Extends: NonNullValidator

public class NonEmptyMapValidator<K, V> extends NonNullValidator<Map<K, V>>

## Methods

- private NonEmptyMapValidator()
- public void accept(@Nullable Map<K, V> t, @Nonnull ValidationResults results)

Also in this package: ArraySizeRangeValidator, ArraySizeValidator, ArrayValidator, DeprecatedValidator, DoubleArraySizeValidator, DoubleArrayValidator, EqualValidator, FloatArrayValidator, IntArraySizeValidator, IntArrayValidator, ListValidator, MapKeyValidator, MapValidator, MapValueValidator, NonEmptyArrayValidator, NonEmptyDoubleArrayValidator, NonEmptyFloatArrayValidator, NonEmptyStringValidator, NonNullValidator, NotEqualValidator (and 6 more)

Complete API:
  public void accept(Map<K,V> t, ValidationResults results)

Fields:
public static final NonEmptyMapValidator<?,?> INSTANCE
