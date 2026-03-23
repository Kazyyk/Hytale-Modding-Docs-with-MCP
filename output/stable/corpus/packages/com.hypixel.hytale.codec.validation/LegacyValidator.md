# LegacyValidator

Type: interface | Package: com.hypixel.hytale.codec.validation | Extends: Validator<T>

public interface LegacyValidator<T> extends Validator<T>

## Methods

- @Override void accept(T var1, ValidationResults var2)
- @Override void updateSchema(SchemaContext context, Schema target)

Known implementors: DeprecatedValidator, ListValidator, RequiredBlockFaceSupportValidator, WeightMapValidator

Also in this package: LateValidator, Result, ThrowingValidationResults, ValidatableCodec, ValidationResult, ValidationResults, Validator, ValidatorCache, ValidatorResultsHolder, Validators

Complete API:
  void accept(T var1, ValidationResults var2)
  default void updateSchema(SchemaContext context, Schema target)
