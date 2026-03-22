---
title: "BuilderAttributeDescriptor"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.BuilderAttributeDescriptor"
api_surface: false
extends: ~
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "asset"
  - "builder"
---

**Package:** `com.hypixel.hytale.server.npc.asset.builder`

```java
public class BuilderAttributeDescriptor
```

Describes a single attribute within a [BuilderDescriptor](BuilderDescriptor.md). Each attribute has a name, type string, lifecycle state, descriptions, and optional metadata such as requirement level, default value, domain constraints, array length bounds, and a `Validator`. Uses a fluent API for configuration.

## Inner Types

### RequirementType (enum)

```java
private static enum RequirementType
```

| Constant | Description |
|---|---|
| `REQUIRED` | The attribute must be present. |
| `OPTIONAL` | The attribute may be omitted; a default value applies. |
| `REQUIRED_IF_NOT_OVERRIDDEN` | Required unless a parent builder provides it. |

## Constructor

```java
public BuilderAttributeDescriptor(String name, String type, BuilderDescriptorState state, String shortDescription, String longDescription)
```

Creates an attribute descriptor. Defaults to `OPTIONAL` requirement, not computable, no default value, no domain, no validator, and no size constraints.

## Fields

| Field | Type | Description |
|---|---|---|
| `name` | `String` | Attribute name as it appears in JSON. |
| `type` | `String` | Type description string (e.g., "double", "string", "enum"). |
| `required` | `RequirementType` | Whether the attribute is required. |
| `computable` | `boolean` | Whether the value can be an expression. |
| `state` | [BuilderDescriptorState](BuilderDescriptorState.md) | Lifecycle state of the attribute. |
| `shortDescription` | `String` | Brief description of the attribute. |
| `longDescription` | `String` | Detailed description of the attribute. |
| `defaultValue` | `String` | String representation of the default value, if any. |
| `domain` | `String` | Constraint domain string (e.g., enum values). |
| `minSize` / `maxSize` | `int` | Array length bounds. `-1` means unconstrained. |
| `validator` | `Validator` | Optional validator for the attribute's value. |
| `flagDescriptions` | `Map<String, String>` | Enum flag names mapped to descriptions. |

## Fluent Configuration Methods

```java
@Nonnull
public BuilderAttributeDescriptor required()
```

Marks the attribute as required and clears any default value.

```java
@Nonnull
public BuilderAttributeDescriptor requiredIfNotOverridden()
```

Marks the attribute as required unless overridden by a parent builder.

```java
@Nonnull
public BuilderAttributeDescriptor optional(String defaultValue)
```

Marks the attribute as optional with the given default value. Overloaded for `double[]`, `int[]`, `String[]`, and `boolean[]`.

```java
@Nonnull
public BuilderAttributeDescriptor computable()
```

Marks the attribute as supporting expression evaluation.

```java
@Nonnull
public <E extends Enum<E>> BuilderAttributeDescriptor setBasicEnum(@Nonnull Class<E> clazz)
```

Sets the domain from enum constants. Uses `toString()` for both name and description.

```java
@Nonnull
public <E extends Enum<E> & Supplier<String>> BuilderAttributeDescriptor setEnum(@Nonnull Class<E> clazz)
```

Sets the domain from enum constants. Uses `toString()` for the name and `get()` for the description.

```java
@Nonnull
public BuilderAttributeDescriptor domain(String domain)
```

Sets an explicit domain constraint string.

```java
@Nonnull
public BuilderAttributeDescriptor validator(Validator validator)
```

Attaches a validator to this attribute.

```java
@Nonnull
public BuilderAttributeDescriptor length(int size)
```

Sets both min and max array length to the given size.

```java
@Nonnull
public BuilderAttributeDescriptor length(int minSize, int maxSize)
```

Sets the minimum and maximum array length bounds.

## Related Types

- [BuilderDescriptor](BuilderDescriptor.md) -- contains a list of these attribute descriptors
- [BuilderDescriptorState](BuilderDescriptorState.md) -- lifecycle state enum
- [BuilderBase](BuilderBase.md) -- uses attribute descriptors during schema generation
