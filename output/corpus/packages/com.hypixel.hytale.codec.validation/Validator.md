# Validator

Type: interface | Package: com.hypixel.hytale.codec.validation | Extends: BiConsumer<T, ValidationResults>

public interface Validator<T> extends BiConsumer<T, ValidationResults>

## Methods

- @Override public void accept(T t, ValidationResults results)
- @Override public void acceptLate(T t, ValidationResults results, ExtraInfo extraInfo)
- @Override public void updateSchema(SchemaContext context, Schema target)
- void accept(T var1, ValidationResults var2)
- void updateSchema(SchemaContext var1, Schema var2)
- @Nonnull LateValidator<T> late()
