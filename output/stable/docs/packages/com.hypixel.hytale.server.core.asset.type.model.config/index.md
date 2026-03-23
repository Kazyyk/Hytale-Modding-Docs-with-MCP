---
title: "com.hypixel.hytale.server.core.asset.type.model.config"
kind: "package"
package: "com.hypixel.hytale.server.core.asset.type.model.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.model.config"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "model"
  - "asset"
  - "config"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.model.config`

Model asset configuration types. Defines the runtime `Model` (resolved from a `ModelAsset` with scale, attachments, bounding boxes, animations, particles, trails, camera settings, and phobia support), the `ModelAsset` JSON asset definition, `ModelAttachment` for sub-model overlays, `ModelParticle` for particle system bindings, and `DetailBox` for named hitbox regions.

## Types

| Type | Kind | Description |
|---|---|---|
| [DetailBox](DetailBox.md) | class | Named bounding box with an offset, used for detail hitbox regions on models. |
| [Model](Model.md) | class | Resolved runtime model with scale, bounding boxes, animations, particles, trails, and camera. |
| [ModelAsset](ModelAsset.md) | class | JSON asset definition for model configuration including all visual and physics properties. |
| [ModelAttachment](ModelAttachment.md) | class | Sub-model attachment with model path, texture, gradient, and weighted random selection. |
| [ModelParticle](ModelParticle.md) | class | Particle system binding to a model node with position/rotation offsets and color. |
