# FarmingStageData

Type: abstract class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config.farming | Extends: java.lang.Object

Base class for farming stage definitions. Each stage has a `duration` range, optional sound event, and lifecycle methods: `apply()` (triggers when entering the stage), `remove()` (cleanup when leaving), and `shouldStop()` (conditional early termination). Uses a `CodecMapCodec` for polymorphic deserialization by `Type` key.
