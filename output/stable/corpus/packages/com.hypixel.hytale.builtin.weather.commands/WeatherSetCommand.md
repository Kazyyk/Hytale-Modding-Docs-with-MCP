# WeatherSetCommand

Type: class | Package: com.hypixel.hytale.builtin.weather.commands | Extends: AbstractWorldCommand

public class WeatherSetCommand extends AbstractWorldCommand

## Fields

- private final RequiredArg<Weather> weatherArg

## Methods

- @Override protected void execute(CommandContext context, World world, Store<EntityStore> store)
- protected static void setForcedWeather(World world, String forcedWeather, ComponentAccessor<EntityStore> componentAccessor)
