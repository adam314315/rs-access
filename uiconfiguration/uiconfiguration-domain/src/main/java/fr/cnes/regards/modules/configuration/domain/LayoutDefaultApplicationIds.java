/*
 * Copyright 2017-2024 CNES - CENTRE NATIONAL d'ETUDES SPATIALES
 *
 * This file is part of REGARDS.
 *
 * REGARDS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * REGARDS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with REGARDS. If not, see <http://www.gnu.org/licenses/>.
 */
package fr.cnes.regards.modules.configuration.domain;

/**
 * Class LayoutDefaultApplicationIds
 * <p>
 * Enumeration for know IHM applications that needs to configure a layout.
 *
 * @author Sébastien Binda
 * @since 1.0-SNAPSHOT
 */
public enum LayoutDefaultApplicationIds {
    USER("user"), PORTAL("portal");

    private String value;

    private LayoutDefaultApplicationIds(final String pValue) {
        value = pValue;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
