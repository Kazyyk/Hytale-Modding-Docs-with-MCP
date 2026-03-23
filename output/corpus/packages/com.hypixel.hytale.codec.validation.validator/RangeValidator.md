# RangeValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator | Extends: Comparable | Implements: Validator

public class RangeValidator<T extends Comparable<T>> implements Validator<T>

## Fields

- private final T min
- private final T max
- private final boolean inclusive

## Methods

- public RangeValidator(T min, T max, boolean inclusive)
- public void accept(@Nullable T t, @Nonnull ValidationResults results)
- public void updateSchema(SchemaContext context, Schema target)
- private void updateSchema(Schema target)
