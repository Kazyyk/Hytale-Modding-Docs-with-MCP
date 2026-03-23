# ValidationResults

Type: record | Package: com.hypixel.hytale.codec.validation

public class ValidationResults

## Fields

- protected final ExtraInfo extraInfo
- protected List<ValidationResults.ValidatorResultsHolder> validatorExceptions
- protected List<ValidationResults.ValidationResult> results

## Methods

- public ExtraInfo getExtraInfo()
- public void fail(String reason)
- public void warn(String reason)
- public void add(ValidationResults.ValidationResult result)
- public void _processValidationResults()
- public void logOrThrowValidatorExceptions(@Nonnull HytaleLogger logger)
- public void logOrThrowValidatorExceptions(@Nonnull HytaleLogger logger, @Nonnull String msg)
- public boolean hasFailed()
- @Nullable public List<ValidationResults.ValidationResult> getResults()
- public void setResults(@Nullable List<ValidationResults.ValidationResult> results)
- @Override @Nonnull public String toString()
- public record ValidationResult(ValidationResults.Result result, String reason)
- public boolean appendResult(@Nonnull StringBuilder sb)
- @Nonnull public static ValidationResults.ValidationResult fail(String reason)
- @Nonnull public static ValidationResults.ValidationResult warn(String reason)
- protected record ValidatorResultsHolder(String key, int line, int column, List<ValidationResults.ValidationResult> results)

## Inner Types

- `ValidationResults.Result`
- `ValidationResults.ValidationResult`
- `ValidationResults.ValidatorResultsHolder`

Known subclasses: AssetValidationResults, CommandValidationResults, ThrowingValidationResults

Also in this package: LateValidator, LegacyValidator, Result, ThrowingValidationResults, ValidatableCodec, ValidationResult, Validator, ValidatorCache, ValidatorResultsHolder, Validators

Complete API:
  public ExtraInfo getExtraInfo()
  public void fail(String reason)
  public void warn(String reason)
  public void add(ValidationResults.ValidationResult result)
  public void _processValidationResults()
  public void logOrThrowValidatorExceptions(HytaleLogger logger)
  public void logOrThrowValidatorExceptions(HytaleLogger logger, String msg)
  public boolean hasFailed()
  public List<ValidationResults.ValidationResult> getResults()
  public void setResults(List<ValidationResults.ValidationResult> results)
  public String toString()

Fields:
protected final ExtraInfo extraInfo
protected List<ValidationResults.ValidatorResultsHolder> validatorExceptions
protected List<ValidationResults.ValidationResult> results
