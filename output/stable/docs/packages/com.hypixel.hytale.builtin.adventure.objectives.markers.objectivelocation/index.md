---
title: "com.hypixel.hytale.builtin.adventure.objectives.markers.objectivelocation"
kind: "package"
package: "com.hypixel.hytale.builtin.adventure.objectives.markers.objectivelocation"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "adventure"
  - "objectives"
  - "markers"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.markers.objectivelocation`

Objective location marker system for the adventure mode. Provides the ECS component for placing objective markers in the world and the systems that initialize markers, track/untrack players entering and leaving objective areas, and manage objective lifecycle.

## Types

| Type | Kind | Description |
|---|---|---|
| [ObjectiveLocationMarker](ObjectiveLocationMarker.md) | class | ECS component (`Component<EntityStore>`) representing an objective location marker in the world. |
| [ObjectiveLocationMarkerSystems](ObjectiveLocationMarkerSystems.md) | class | Container for ECS systems that drive objective location markers. |
