---
title: "InetSocketAddressCodec"
kind: "class"
package: "com.hypixel.hytale.codec.codecs"
fqcn: "com.hypixel.hytale.codec.codecs.InetSocketAddressCodec"
api_surface: false
extends: null
implements: ["Codec<InetSocketAddress>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "codec"
  - "codecs"
---

**Package:** `com.hypixel.hytale.codec.codecs`

```java
public class InetSocketAddressCodec implements Codec<InetSocketAddress>
```

Codec for serializing and deserializing InetSocketAddress values.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `private static final` | `Pattern` | `ADDRESS_PATTERN` | `Pattern.compile("(.*?:)?[0-9]+")` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `int` | `defaultPort` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `InetSocketAddressCodec(int defaultPort)` |
| `@Nonnull public` | `InetSocketAddress` | `decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)` |
| `@Nonnull public` | `BsonValue` | `encode(@Nonnull InetSocketAddress r, ExtraInfo extraInfo)` |
| `@Nonnull public` | `InetSocketAddress` | `decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)` |
| `@Nonnull @Override public` | `Schema` | `toSchema(@Nonnull SchemaContext context)` |
| `@Nonnull private static` | `InetSocketAddress` | `decodeString(@Nonnull String value, int defaultPort)` |
