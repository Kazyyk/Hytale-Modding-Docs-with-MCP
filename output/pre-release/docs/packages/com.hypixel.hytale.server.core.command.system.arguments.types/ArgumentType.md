---
title: "ArgumentType"
kind: "class"
package: "com.hypixel.hytale.server.core.command.system.arguments.types"
fqcn: "com.hypixel.hytale.server.core.command.system.arguments.types.ArgumentType"
api_surface: true
extends: "java.lang.Object"
implements:
  - "SuggestionProvider"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:06Z"
tags:
  - "command"
  - "argument"
---

**Package:** `com.hypixel.hytale.server.core.command.system.arguments.types`

```java
public abstract class ArgumentType<DataType> implements SuggestionProvider
```

Abstract base class for command argument types. Defines the contract for parsing string input into a typed value, providing tab-completion suggestions, and reporting usage information.

## Methods

```java
@Nullable
public abstract DataType parse(@Nonnull String[] var1, @Nonnull ParseResult var2)
```

Parses the input string array into the target data type. Returns `null` on parse failure.

```java
@Nonnull
public Message getArgumentUsage()
```

Returns a localized message describing argument usage.

```java
public int getNumberOfParameters()
```

Returns the number of string parameters this argument type consumes.

```java
@Nonnull
public Message getName()
```

Returns the localized name of this argument type.

```java
@Nonnull
public String[] getExamples()
```

Returns example values for this argument type.

```java
public boolean isListArgument()
```

Returns whether this argument accepts a list of values.

```java
public boolean isGreedyString()
```

Returns whether this argument consumes all remaining input.

```java
@Override
public void suggest(@Nonnull CommandSender sender, @Nonnull String textAlreadyEntered, int numParametersTyped, @Nonnull SuggestionResult result)
```

Populates tab-completion suggestions. Default implementation provides no suggestions.

## Related Types

- [ArgTypes](ArgTypes.md) -- registry of built-in argument types
- `AbstractCommand` -- commands use argument types for parameter definitions
