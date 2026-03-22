---
title: "ValidationResults"
kind: "record"
package: "com.hypixel.hytale.codec.validation"
fqcn: "com.hypixel.hytale.codec.validation.ValidationResults"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "codec"
  - "validation"
  - "record"
---

**Package:** `com.hypixel.hytale.codec.validation`

```java
public class ValidationResults
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `ExtraInfo` | `extraInfo` |
| `protected` | `List<ValidationResults.ValidatorResultsHolder>` | `validatorExceptions` |
| `protected` | `List<ValidationResults.ValidationResult>` | `results` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `ExtraInfo` | `getExtraInfo()` |
| `public` | `void` | `fail(String reason)` |
| `public` | `void` | `warn(String reason)` |
| `public` | `void` | `add(ValidationResults.ValidationResult result)` |
| `public` | `void` | `_processValidationResults()` |
| `public` | `void` | `logOrThrowValidatorExceptions(@Nonnull HytaleLogger logger)` |
| `public` | `void` | `logOrThrowValidatorExceptions(@Nonnull HytaleLogger logger, @Nonnull String msg)` |
| `public` | `boolean` | `hasFailed()` |
| `@Nullable public` | `List<ValidationResults.ValidationResult>` | `getResults()` |
| `public` | `void` | `setResults(@Nullable List<ValidationResults.ValidationResult> results)` |
| `@Override @Nonnull public` | `String` | `toString()` |
| `public` | `record` | `ValidationResult(ValidationResults.Result result, String reason)` |
| `public` | `boolean` | `appendResult(@Nonnull StringBuilder sb)` |
| `@Nonnull public static` | `ValidationResults.ValidationResult` | `fail(String reason)` |
| `@Nonnull public static` | `ValidationResults.ValidationResult` | `warn(String reason)` |
| `protected` | `record` | `ValidatorResultsHolder(String key, int line, int column, List<ValidationResults.ValidationResult> results)` |

## Inner Types

- `ValidationResults.Result`
- `ValidationResults.ValidationResult`
- `ValidationResults.ValidatorResultsHolder`
