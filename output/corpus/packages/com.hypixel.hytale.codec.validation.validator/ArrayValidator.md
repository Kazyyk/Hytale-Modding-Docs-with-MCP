# ArrayValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator

public class ArrayValidator<T> implements Validator<T[]>

## Fields

- private Validator<T> validator

## Methods

- public ArrayValidator(Validator<T> validator)
- public ArrayValidator(LegacyValidator<T> validator)
- public Validator<T> getValidator()
- public void accept(@Nullable T[] ts, ValidationResults results)
- public void updateSchema(SchemaContext context, Schema target)
