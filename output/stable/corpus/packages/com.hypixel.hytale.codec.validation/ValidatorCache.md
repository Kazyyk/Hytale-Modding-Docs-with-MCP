# ValidatorCache

Type: class | Package: com.hypixel.hytale.codec.validation

public class ValidatorCache<T>

## Fields

- private final Validator<T> validator
- private ArrayValidator<T> arrayValidator
- private ArrayValidator<T[]> arrayofArrayValidator
- private MapKeyValidator<T> mapKeyValidator
- private MapKeyValidator<T[]> mapArrayKeyValidator
- private MapValueValidator<T> mapValueValidator
- private MapValueValidator<T[]> mapArrayValueValidator

## Methods

- public Validator<T> getValidator()
- @Nonnull public ArrayValidator<T> getArrayValidator()
- @Nonnull public ArrayValidator<T[]> getArrayOfArrayValidator()
- @Nonnull public MapKeyValidator<T> getMapKeyValidator()
- @Nonnull public MapKeyValidator<T[]> getMapArrayKeyValidator()
- @Nonnull public MapValueValidator<T> getMapValueValidator()
- @Nonnull public MapValueValidator<T[]> getMapArrayValueValidator()

Also in this package: LateValidator, LegacyValidator, Result, ThrowingValidationResults, ValidatableCodec, ValidationResult, ValidationResults, Validator, ValidatorResultsHolder, Validators

Complete API:
  public Validator<T> getValidator()
  public ArrayValidator<T> getArrayValidator()
  public ArrayValidator<T[]> getArrayOfArrayValidator()
  public MapKeyValidator<T> getMapKeyValidator()
  public MapKeyValidator<T[]> getMapArrayKeyValidator()
  public MapValueValidator<T> getMapValueValidator()
  public MapValueValidator<T[]> getMapArrayValueValidator()

Fields:
private final Validator<T> validator
private ArrayValidator<T> arrayValidator
private ArrayValidator<T[]> arrayofArrayValidator
private MapKeyValidator<T> mapKeyValidator
private MapKeyValidator<T[]> mapArrayKeyValidator
private MapValueValidator<T> mapValueValidator
private MapValueValidator<T[]> mapArrayValueValidator
