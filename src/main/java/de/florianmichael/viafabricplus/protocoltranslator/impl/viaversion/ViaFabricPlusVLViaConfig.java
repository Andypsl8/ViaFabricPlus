/*
 * This file is part of ViaFabricPlus - https://github.com/FlorianMichael/ViaFabricPlus
 * Copyright (C) 2021-2024 FlorianMichael/EnZaXD <florian.michael07@gmail.com> and RK_01/RaphiMC
 * Copyright (C) 2023-2024 contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.florianmichael.viafabricplus.protocoltranslator.impl.viaversion;

import net.raphimc.vialoader.impl.viaversion.VLViaConfig;

import java.io.File;
import java.util.logging.Logger;

public class ViaFabricPlusVLViaConfig extends VLViaConfig {

    public ViaFabricPlusVLViaConfig(File configFile, Logger logger) {
        super(configFile, logger);

        UNSUPPORTED.add("simulate-pt");
        UNSUPPORTED.add("fix-1_21-placement-rotation");
    }

    @Override
    public boolean isSimulatePlayerTick() {
        return false;
    }

    @Override
    public boolean fix1_21PlacementRotation() {
        return false;
    }

}
