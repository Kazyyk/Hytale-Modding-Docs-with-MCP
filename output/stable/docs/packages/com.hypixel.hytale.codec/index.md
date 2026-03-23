---
title: "com.hypixel.hytale.codec"
package: "com.hypixel.hytale.codec"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
---

**Package:** `com.hypixel.hytale.codec`

## Interfaces

| Type | Description |
|---|---|
| [Codec](Codec.md) | Core serialization/deserialization interface for the codec system |
| [DirectDecodeCodec](DirectDecodeCodec.md) | Codec extension for in-place decoding into existing objects |
| [ExtraInfo](ExtraInfo.md) | Abstract base class for codec encode/decode context |
| [InheritCodec](InheritCodec.md) | Codec extension supporting asset inheritance |
| [RawJsonCodec](RawJsonCodec.md) | Interface for codecs decoding from raw JSON streams |

## Classes

| Type | Description |
|---|---|
| [DocumentContainingCodec](DocumentContainingCodec.md) | Deprecated codec preserving unknown BSON document fields |
| [EmptyExtraInfo](EmptyExtraInfo.md) | Singleton ExtraInfo with no additional context |
| [KeyedCodec](KeyedCodec.md) | Codec wrapper with an associated string key for named fields |
| [PrimitiveCodec](PrimitiveCodec.md) | Abstract base for codecs handling primitive value types |
| [RawJsonInheritCodec](RawJsonInheritCodec.md) | Combines inheritance-based and raw JSON stream decoding |
| [VersionedExtraInfo](VersionedExtraInfo.md) | ExtraInfo with version number for version-aware decoding |
| [WrappedCodec](WrappedCodec.md) | Codec decorator wrapping another codec instance |
