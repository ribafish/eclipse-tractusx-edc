/*
 *  Copyright (c) 2023 Bayerische Motoren Werke Aktiengesellschaft (BMW AG)
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 *
 *  Contributors:
 *       Bayerische Motoren Werke Aktiengesellschaft (BMW AG) - initial API and implementation
 *
 */

plugins {
    `java-library`
    `maven-publish`
}

dependencies {
    implementation(project(":spi:ssi-spi"))
    implementation(libs.edc.spi.core)
    implementation(libs.edc.spi.jwt)
    implementation(libs.edc.spi.token)
    implementation(libs.edc.token.core)
    implementation(libs.nimbus.jwt)
    testImplementation(testFixtures(libs.edc.junit))
}
