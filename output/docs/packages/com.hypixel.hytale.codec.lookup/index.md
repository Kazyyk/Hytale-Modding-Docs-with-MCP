---
title: "com.hypixel.hytale.codec.lookup"
kind: "package"
package: "com.hypixel.hytale.codec.lookup"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "codec"
  - "lookup"
  - "serialization"
---

**Package:** `com.hypixel.hytale.codec.lookup`

Polymorphic codec map infrastructure for the Hytale serialization framework. These types implement discriminator-based deserialization: given a BSON document (or string), they look up a key field to select the correct typed codec for the payload. This pattern is used pervasively for deserializing game assets, configurations, and protocol types that have multiple concrete subtypes.

## Codec Map Hierarchy

| Type | Kind | API Surface | Description |
|---|---|---|---|
| [ACodecMapCodec](ACodecMapCodec.md) | class | yes | Abstract base for all discriminator-based polymorphic codec maps. |
| [CodecMapCodec](CodecMapCodec.md) | class | yes | String-keyed codec map (most common variant). |
| [MapKeyMapCodec](MapKeyMapCodec.md) | class | yes | Uses the BSON map key as discriminator instead of a nested field. |
| [ObjectCodecMapCodec](ObjectCodecMapCodec.md) | class | yes | Generic-keyed codec map for non-string key types. |
| [StringCodecMapCodec](StringCodecMapCodec.md) | class | yes | Decodes from plain strings or documents with string key lookup. |
| [BuilderCodecMapCodec](BuilderCodecMapCodec.md) | class | no | Specialized variant for BuilderCodec registration. |

## Map-Provided Codecs

| Type | Kind | API Surface | Description |
|---|---|---|---|
| [AMapProvidedMapCodec](AMapProvidedMapCodec.md) | class | yes | Abstract codec resolving from a dynamically provided map. |
| [MapProvidedMapCodec](MapProvidedMapCodec.md) | class | yes | String-keyed map-provided codec. |

## Supporting Types

| Type | Kind | API Surface | Description |
|---|---|---|---|
| [Priority](Priority.md) | enum | yes | Registration priority levels for default codec ordering. |
