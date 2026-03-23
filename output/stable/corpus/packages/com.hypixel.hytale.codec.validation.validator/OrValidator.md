# OrValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator | Implements: Validator

public class OrValidator<T> implements Validator<T>

## Fields

- private final Validator<T>[] validators

## Methods

- public OrValidator(Validator<T>[] validators)
- public void accept(T t, @Nonnull ValidationResults results)
- public void updateSchema(SchemaContext context, @Nonnull Schema target)
