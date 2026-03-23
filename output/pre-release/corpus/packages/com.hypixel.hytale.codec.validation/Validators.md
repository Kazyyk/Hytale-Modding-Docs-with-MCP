# Validators

Type: class | Package: com.hypixel.hytale.codec.validation

public class Validators

## Methods

- @Nonnull public static <T> DeprecatedValidator<T> deprecated()
- @Nonnull public static <T> Validator<T> nonNull()
- @Nonnull public static <T> ArrayValidator<T> nonNullArrayElements()
- @Nonnull public static Validator<String> nonEmptyString()
- @Nonnull public static <T> Validator<T[]> nonEmptyArray()
- @Nonnull public static <T> Validator<T[]> uniqueInArray()
- @Nonnull public static <T> Validator<T[]> arraySizeRange(int min, int max)
- @Nonnull public static <T> Validator<T[]> arraySize(int size)
- @Nonnull public static Validator<int[]> intArraySize(int size)
- @Nonnull public static Validator<double[]> doubleArraySize(int size)
- @Nonnull public static Validator<double[]> nonEmptyDoubleArray()
- @Nonnull public static Validator<float[]> nonEmptyFloatArray()
- @Nonnull public static Validator<double[]> monotonicSequentialDoubleArrayValidator()
- @Nonnull public static Validator<double[]> weaklyMonotonicSequentialDoubleArrayValidator()
- @Nonnull public static <T> Validator<T> or(Validator<T>... validators)
- @Nonnull public static <T> Validator<List<T>> listItem(Validator<T> validator)

Also in this package: LateValidator, LegacyValidator, Result, ThrowingValidationResults, ValidatableCodec, ValidationResult, ValidationResults, Validator, ValidatorCache, ValidatorResultsHolder

Complete API:
  public static DeprecatedValidator<T> deprecated()
  public static Validator<T> nonNull()
  public static ArrayValidator<T> nonNullArrayElements()
  public static Validator<String> nonEmptyString()
  public static Validator<T[]> nonEmptyArray()
  public static Validator<Map<K,V>> nonEmptyMap()
  public static Validator<T[]> uniqueInArray()
  public static Validator<Map<T,?>> requiredMapKeysValidator(T[] array)
  public static Validator<T> greaterThan(T greaterThan)
  public static Validator<T> greaterThanOrEqual(T greaterThan)
  public static Validator<T> lessThan(T lessThan)
  public static Validator<T> insideRange(T greaterthan, T lessThan)
  public static Validator<T> min(T min)
  public static Validator<T> max(T max)
  public static Validator<T> range(T min, T max)
  public static Validator<T[]> arraySizeRange(int min, int max)
  public static Validator<T[]> arraySize(int size)
  public static Validator<int[]> intArraySize(int size)
  public static Validator<double[]> doubleArraySize(int size)
  public static Validator<T> equal(T value)
  public static Validator<T> notEqual(T value)
  public static Validator<double[]> nonEmptyDoubleArray()
  public static Validator<float[]> nonEmptyFloatArray()
  public static Validator<double[]> monotonicSequentialDoubleArrayValidator()
  public static Validator<double[]> weaklyMonotonicSequentialDoubleArrayValidator()
  public static Validator<T> or(Validator<T> validators)
  public static Validator<List<T>> listItem(Validator<T> validator)
