---
title: "BuilderDescriptor"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.BuilderDescriptor"
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
public class BuilderDescriptor
```

Describes a builder type's schema for documentation and validation generation. Contains the builder's name, category, lifecycle state, descriptions, and lists of [BuilderAttributeDescriptor](BuilderAttributeDescriptor.md) entries, validators, and provider evaluators.

## Fields

| Field | Type | Description |
|---|---|---|
| `name` | `String` | The builder type name. |
| `category` | `String` | The category string (e.g., "Role", "Action"). |
| `state` | [BuilderDescriptorState](BuilderDescriptorState.md) | Lifecycle state. |
| `shortDescription` | `String` | Brief description. |
| `longDescription` | `String` | Detailed description. |
| `attributes` | `List<BuilderAttributeDescriptor>` | Attribute definitions. |
| `validators` | `List<Validator>` | Cross-attribute validators. |
| `providerEvaluators` | `List<ProviderEvaluator>` | Feature provider evaluators. |
| `tags` | `Set<String>` | Classification tags. |

## Constructor

```java
public BuilderDescriptor(String name, String category, String shortDescription, String longDescription, Set<String> tags, BuilderDescriptorState state)
```

## Methods

### addAttribute

```java
public BuilderAttributeDescriptor addAttribute(BuilderAttributeDescriptor attributeDescriptor)
```

Adds a pre-built attribute descriptor and returns it for fluent chaining.

```java
public BuilderAttributeDescriptor addAttribute(String name, String type, BuilderDescriptorState state, String shortDescription, String longDescription)
```

Creates and adds a new attribute descriptor.

### addValidator

```java
public void addValidator(Validator validator)
```

Adds a cross-attribute validator.

### addProviderEvaluator

```java
public void addProviderEvaluator(ProviderEvaluator providerEvaluator)
```

Adds a feature provider evaluator.

## Related Types

- [BuilderAttributeDescriptor](BuilderAttributeDescriptor.md) -- individual attribute metadata
- [BuilderDescriptorState](BuilderDescriptorState.md) -- lifecycle state enum
- [Builder](Builder.md) -- `getDescriptor()` returns this type
