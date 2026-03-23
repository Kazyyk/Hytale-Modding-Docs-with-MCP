---
title: "com.hypixel.hytale.builtin.adventure.shop.barter"
kind: "package"
package: "com.hypixel.hytale.builtin.adventure.shop.barter"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "adventure"
  - "shop"
  - "barter"
---

**Package:** `com.hypixel.hytale.builtin.adventure.shop.barter`

Barter shop system for Hytale's adventure mode. Implements NPC-driven trading where players exchange items according to configured trade offers. Supports fixed trades, weighted random trade pools with configurable refresh intervals, and per-shop runtime state tracking.

## Asset and State

| Type | Kind | Description |
|---|---|---|
| [BarterShopAsset](BarterShopAsset.md) | class | JSON-loaded shop configuration with trade slots and layout. |
| [BarterShopState](BarterShopState.md) | class | Runtime state tracking stock levels and refresh timers. |
| [BarterPage](BarterPage.md) | class | UI page managing trade display and purchase transactions. |

## Trade Types

| Type | Kind | Description |
|---|---|---|
| [BarterTrade](BarterTrade.md) | class | A single trade: input cost and output reward. |
| [BarterItemStack](BarterItemStack.md) | class | Item ID and quantity within a trade. |
| [WeightedTrade](WeightedTrade.md) | class | Trade with a selection weight for pool slots. |

## Slot Types

| Type | Kind | Description |
|---|---|---|
| [TradeSlot](TradeSlot.md) | class | Abstract base for shop trade slots. |
| [FixedTradeSlot](FixedTradeSlot.md) | class | Slot offering a permanent fixed trade. |
| [PoolTradeSlot](PoolTradeSlot.md) | class | Slot drawing from a weighted random pool. |

## Configuration

| Type | Kind | Description |
|---|---|---|
| [RefreshInterval](RefreshInterval.md) | enum | Time interval for rotating trade refreshes. |
