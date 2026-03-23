# EqualValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator | Extends: Comparable | Implements: Validator

public class EqualValidator<T extends Comparable<T>> implements Validator<T>

## Fields

- private final T value

## Methods

- public EqualValidator(@Nonnull T value)
- public void accept(@Nullable T o, @Nonnull ValidationResults results)
- public void updateSchema(SchemaContext context, @Nonnull Schema target)
