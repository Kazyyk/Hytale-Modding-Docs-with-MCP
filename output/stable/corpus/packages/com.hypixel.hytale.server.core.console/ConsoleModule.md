# ConsoleModule

Type: class | Package: com.hypixel.hytale.server.core.console | Extends: JavaPlugin

public class ConsoleModule extends JavaPlugin

Server module providing core functionality.

## Fields

- instance | ConsoleModule | Static ConsoleModule field.
- terminal | Terminal | Static Terminal field.
- consoleRunnable | ConsoleModule.ConsoleRunnable | ConsoleModule.ConsoleRunnable field.

## Constructors

- ConsoleModule(@Nonnull JavaPluginInit init) | Creates a new ConsoleModule instance.

## Methods

- get() | ConsoleModule | static public method.
- initializeTerminal() | void | static public method.
- setup() | void | protected method.
- shutdown() | void | protected method.
- getTerminal() | Terminal | public method.

Also in this package: ConsoleRunnable, ConsoleSender

Complete API:
  public static ConsoleModule get()
  public static void initializeTerminal()
  protected void setup()
  protected void shutdown()
  public Terminal getTerminal()

Fields:
private static final HytaleLogger LOGGER
public static final PluginManifest MANIFEST
private static ConsoleModule instance
private static Terminal terminal
private ConsoleModule.ConsoleRunnable consoleRunnable
