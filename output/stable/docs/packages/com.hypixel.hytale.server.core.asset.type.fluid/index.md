---
title: "com.hypixel.hytale.server.core.asset.type.fluid"
kind: "package"
package: "com.hypixel.hytale.server.core.asset.type.fluid"
fqcn: "com.hypixel.hytale.server.core.asset.type.fluid"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "core"
  - "asset"
  - "fluid"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.fluid`

Fluid system asset types. Defines the `Fluid` asset (loaded from JSON asset packs), its tick behavior via `FluidTicker` subclasses, and network packet generation. Three ticker implementations provide distinct fluid physics: `DefaultFluidTicker` for standard liquid spreading with collision reactions, `FiniteFluidTicker` for volume-conserving finite water simulation, and `FireFluidTicker` for fire propagation with tag-pattern-based flammability.

## Types

| Type | Kind | Description |
|---|---|---|
| [Fluid](Fluid.md) | class | JSON-loaded fluid asset with textures, effects, opacity, tickers, particles, and interactions. |
| [FluidTicker](FluidTicker.md) | abstract class | Base tick logic for fluid simulation: flow rate, alive status, solid block checks, spread algorithm. |
| [DefaultFluidTicker](DefaultFluidTicker.md) | class | Standard liquid ticker with downward/lateral spreading, spread fluid conversion, and collision configs. |
| [FiniteFluidTicker](FiniteFluidTicker.md) | class | Volume-conserving finite fluid ticker with downward draining and sideways leveling. |
| [FireFluidTicker](FireFluidTicker.md) | class | Fire propagation ticker with tag-pattern flammability, burn chance, and block replacement. |
| [FluidTypePacketGenerator](FluidTypePacketGenerator.md) | class | Generates `UpdateFluids` network packets for init, update, and remove operations. |
